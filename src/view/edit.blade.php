@extends('app')

@section('content')

    <div class="container">
        <h3>Editando %%MODEL%%</h3>

        @include('errors._check')

        {!! Form::model($dado, ['route' => ['%%MODEL_UPDATE%%', $dado->id]]) !!}

            {{ method_field('PUT') }}

            @include('%%MODEL_FORM%%')

            <div class="form-group">
                {!! Form::submit('Salvar', ['class' => 'btn btn-primary']) !!}
            </div>

        {!! Form::close() !!}

    </div>

@endsection